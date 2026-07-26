import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevents default form submit action (Synthetic Event)
    
    // Assuming 1 Euro = 80 INR based on the lab example output (80 * 80 = 6400)
    if (currency.toLowerCase() === 'euro') {
      const convertedAmount = Number(amount) * 80;
      alert(`Converting to Euro Amount is ${convertedAmount}`);
    } else {
      alert(`Entered currency: ${currency}`);
    }
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div style={{ marginBottom: '10px' }}>
          <label>Currency: </label>
          <textarea
            value={currency}
            rows="2"
            cols="20"
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit" style={{ marginLeft: '60px' }}>
          Submit
        </button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;