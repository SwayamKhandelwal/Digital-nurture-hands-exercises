import React from 'react';
import './App.css';



function App() {
  
  const element = "Office Space";


  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: 'Chennai'
  };

 
  const jsxatt = (
    <img 
      src={"https://plus.unsplash.com/premium_photo-1681487178876-a1156952ec60?fm=jpg&q=60&w=3000&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8b2ZmaWNlJTIwYnVpbGRpbmd8ZW58MHx8MHx8fDA%3D"} 
      width="25%" 
      height="25%" 
      alt="Office Space" 
    />
  );


  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  
  const offices = [
    { Name: "DBS", Rent: 50000, Address: 'Chennai' },
    { Name: "Regus", Rent: 75000, Address: 'Bangalore' },
    { Name: "WeWork", Rent: 55000, Address: 'Mumbai' }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      {/* Heading */}
      <h1>{element} , at Affordable Range </h1>

      {}
      {jsxatt}

      {}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors.join(' ')}>
        Rent: Rs. {ItemName.Rent}
      </h3>
      <h3>Address: {ItemName.Address}</h3>

      <hr style={{ margin: '30px 0' }} />

      {}
      <h2>Available Office Spaces List:</h2>
      {offices.map((office, index) => {
        let rentColor = office.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index} style={{ marginBottom: '15px' }}>
            <h3>Name: {office.Name}</h3>
            <p className={rentColor}><strong>Rent: Rs. {office.Rent}</strong></p>
            <p>Address: {office.Address}</p>
          </div>
        );
      })}
    </div>
  );
}

export default App;