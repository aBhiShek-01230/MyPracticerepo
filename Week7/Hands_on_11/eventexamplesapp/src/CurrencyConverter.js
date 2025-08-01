import React, { Component } from 'react';

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: '',
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euroValue = parseFloat(this.state.rupees) / 90; // Assume 1 Euro = 90 INR
    this.setState({ euro: euroValue.toFixed(2) });
  };

  render() {
    return (
      <div>
        <h2>Currency Converter (INR ➜ EUR)</h2>
        <form onSubmit={this.handleSubmit}>
          <label>Rupees: </label>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            required
          />
          <button type="submit">Convert</button>
        </form>
        <h3>Euro: €{this.state.euro}</h3>
      </div>
    );
  }
}

export default CurrencyConverter;
