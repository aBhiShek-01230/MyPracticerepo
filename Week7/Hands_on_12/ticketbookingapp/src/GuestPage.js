// src/GuestPage.js
import React from 'react';

const GuestPage = () => {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>You can browse flights, but must log in to book tickets.</p>
      <ul>
        <li>Flight A - ₹5000</li>
        <li>Flight B - ₹7200</li>
        <li>Flight C - ₹6300</li>
      </ul>
    </div>
  );
};

export default GuestPage;
