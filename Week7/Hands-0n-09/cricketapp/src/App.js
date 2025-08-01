// src/App.js
import React from 'react';
import ListofPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayer';

function App() {
  const flag = true; // change to false to toggle component

  return (
    <div className="App">
      <h1>Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
