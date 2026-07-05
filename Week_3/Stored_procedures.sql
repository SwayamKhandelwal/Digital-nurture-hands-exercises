--Exercise 3

--Scenario 1
CREATE OR REPLACE PROCEDURE processMonthlyInterest
IS
BEGIN

UPDATE Accounts
SET Balance = Balance + (Balance * 0.01)
WHERE AccountType = 'saving';

COMMIT;

DBMS_OUTPUT.PUT_LINE('monthly interest added');
END;
/

--Scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
dept_name IN VARCHAR2,
bonus IN NUMBER
)
IS
BEGIN

UPDATE Employees
SET Salary = Salary + (Salary * bonus / 100)
WHERE Department = dept_name;

COMMIT;

DBMS_OUTPUT.PUT_LINE('employee bonus updated');

END;
/

--Scenario 3


CREATE OR REPLACE PROCEDURE TransferFunds
(
from_acc IN NUMBER,
to_acc IN NUMBER,
amount IN NUMBER
)
IS
bal NUMBER;
BEGIN

SELECT Balance
INTO bal
FROM Accounts
WHERE AccountID = from_acc;

IF bal >= amount THEN

UPDATE Accounts
SET Balance = Balance - amount
WHERE AccountID = from_acc;

UPDATE Accounts
SET Balance = Balance + amount
WHERE AccountID = to_acc;

COMMIT;

DBMS_OUTPUT.PUT_LINE('transfer completed');

ELSE

DBMS_OUTPUT.PUT_LINE('insufficient balance');

END IF;

END;
/
