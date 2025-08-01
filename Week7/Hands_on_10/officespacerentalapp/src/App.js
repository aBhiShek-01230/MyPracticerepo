import React from 'react';

// Sample image URL for demonstration
const imageUrl = "https://images.unsplash.com/photo-1560185127-6a8c2d2590d2";

const officeSpaces = [
  {
    name: "Tech Park",
    rent: 45000,
    address: "MG Road, Bengaluru"
  },
  {
    name: "Green Workspace",
    rent: 72000,
    address: "Kondapur, Hyderabad"
  },
  {
    name: "Downtown Hub",
    rent: 58000,
    address: "Gurgaon Sector 45"
  },
  {
    name: "Skyline Offices",
    rent: 95000,
    address: "BKC, Mumbai"
  }
];

// Function to conditionally style rent
const getRentStyle = (rent) => {
  return {
    color: rent < 60000 ? "red" : "green",
    fontWeight: "bold"
  };
};

function App() {
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {/* Heading Element */}
      <h1>Office Space Rental App</h1>

      {/* Image Attribute */}
      <img
        src={imageUrl}
        alt="Office Space"
        style={{ width: "100%", maxWidth: "600px", borderRadius: '10px', marginBottom: '20px' }}
      />

      {/* Looping through office spaces */}
      {officeSpaces.map((office, index) => (
        <div
          key={index}
          style={{
            marginBottom: '20px',
            padding: '10px',
            border: '1px solid #ccc',
            borderRadius: '8px',
            boxShadow: '0 2px 6px rgba(0,0,0,0.1)'
          }}
        >
          <h2>{office.name}</h2>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={getRentStyle(office.rent)}>₹{office.rent}</span>
          </p>
          <p>
            <strong>Address:</strong> {office.address}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
