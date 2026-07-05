--Exercise 1

--Scenario 1
SET SERVEROUTPUT ON;

DECLARE
age NUMBER;
BEGIN

 FOR c IN (SELECT CustomerID, DOB FROM Customers) LOOP

  age := TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12);
  IF age > 60 THEN


UPDATE Loans

SET InterestRate = InterestRate - 1
WHERE customerID = c.customerID;

DBMS_OUTPUT.PUT_LINE('discount given to Customer' || c.customerID);
END IF;

END LOOP;

COMMIT;

END;
/

--Scenario 2
SET SERVEROUTPUT ON;

BEGIN

FOR c IN (SELECT CustomerID, Balance FROM Customers)
LOOP

IF c.Balance > 10000 THEN

UPDATE Customers
SET IsVIP = 'Y'
WHERE CustomerID = c.CustomerID;

DBMS_OUTPUT.PUT_LINE('customer ' || c.CustomerID || ' is now VIP');

ELSE

UPDATE Customers
SET IsVIP = 'N'
WHERE CustomerID = c.CustomerID;

END IF;

END LOOP;

COMMIT;

END;
/


--Scenario 3
SET SERVEROUTPUT ON;

BEGIN

FOR l IN
(
SELECT c.Name, l.loanID, l.EndDate
FROM Customers c, Loans l
WHERE c.CustomerID = l.CustomerID
AND l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
)
LOOP

DBMS_OUTPUT.PUT_LINE('reminder:loan'
 || l.loanID ||
'for' || l.Name ||
'is due on' ||
TO_CHAR(l.EndDate,'dd-mm-yyyy'));

END LOOP;

END;
/