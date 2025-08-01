// src/ListofPlayers.jsx
import React from 'react';

const players = [
  { name: 'Virat Kohli', score: 85 },
  { name: 'Rohit Sharma', score: 95 },
  { name: 'Shubman Gill', score: 67 },
  { name: 'KL Rahul', score: 72 },
  { name: 'Hardik Pandya', score: 59 },
  { name: 'Jadeja', score: 91 },
  { name: 'Bumrah', score: 60 },
  { name: 'Ashwin', score: 76 },
  { name: 'Siraj', score: 69 },
  { name: 'Dhoni', score: 97 },
  { name: 'Rishabh Pant', score: 82 },
];

const ListofPlayers = () => {
  // Display all players
  const allPlayers = players.map((player, idx) => (
    <li key={idx}>{player.name} - {player.score}</li>
  ));

  // Filtered using ES6 arrow function
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{allPlayers}</ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {filteredPlayers.map((p, idx) => (
          <li key={idx}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
