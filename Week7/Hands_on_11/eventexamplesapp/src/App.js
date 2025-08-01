import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState((prevState) => ({ counter: prevState.counter + 1 }));
    this.sayHello();
  };

  sayHello = () => {
    alert("Hello! Welcome to React Events.");
  };

  decrement = () => {
    this.setState((prevState) => ({ counter: prevState.counter - 1 }));
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleSyntheticEvent = (e) => {
    e.preventDefault(); // Synthetic event
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>Event Handling in React</h1>

        <h2>Counter: {this.state.counter}</h2>

        <button onClick={this.increment}>Increment</button>{' '}
        <button onClick={this.decrement}>Decrement</button>

        <hr />

        <button onClick={() => this.sayWelcome("Welcome to Event Handling in React!")}>
          Say Welcome
        </button>

        <hr />

        <button onClick={this.handleSyntheticEvent}>
          Synthetic Event Button
        </button>

        <hr />

        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
