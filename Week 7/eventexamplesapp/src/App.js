import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConverter';
import './App.css';

function App() {
  const [counter, setCounter] = useState(0);

  
  const handleIncrement = () => {
    setCounter(prevCount => prevCount + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };


  const handleDecrement = () => {
    setCounter(prevCount => prevCount - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handlePress = (e) => {
    
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      {}
      <div style={{ fontSize: '18px', fontWeight: 'bold', marginBottom: '10px' }}>
        {counter}
      </div>

      {/* Buttons */}
      <div style={{ display: 'flex', flexDirection: 'column', width: '120px', gap: '5px' }}>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
        <button onClick={() => sayWelcome('welcome')}>Say welcome</button>
        <button onClick={handlePress}>Click on me</button>
      </div>

      {}
      <CurrencyConvertor />
    </div>
  );
}

export default App;