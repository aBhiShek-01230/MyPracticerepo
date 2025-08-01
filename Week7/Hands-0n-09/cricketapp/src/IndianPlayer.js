// src/IndianPlayers.jsx
import React from 'react';

const T20players = ['Virat', 'Rohit', 'Pant', 'Hardik', 'Bumrah'];
const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Saha', 'Siraj', 'Ashwin'];

// Merge using spread operator (ES6)
const allPlayers = [...T20players, ...RanjiTrophyPlayers];

const IndianPlayers = () => {
  // Destructuring
  const oddTeam = [];
  const evenTeam = [];

  allPlayers.forEach((player, index) => {
    const [team] = index % 2 === 0 ? [evenTeam] : [oddTeam];
    team.push(player);
  });

  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>{evenTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Odd Team Players</h2>
      <ul>{oddTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Merged Players</h2>
      <ul>{allPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;
