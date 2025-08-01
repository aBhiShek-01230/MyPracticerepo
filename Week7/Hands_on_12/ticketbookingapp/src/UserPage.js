// src/UserPage.js
import React from 'react';

const UserPage = () => {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <p>You can now book your flights.</p>
      <ul>
        <li>Flight A - <button>Book Now</button></li>
        <li>Flight B - <button>Book Now</button></li>
        <li>Flight C - <button>Book Now</button></li>
      </ul>
    </div>
  );
};

export default UserPage;
