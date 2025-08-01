import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [selectedComponent, setSelectedComponent] = useState('');

  const renderComponent = () => {
    // Way 1: if-else
    if (selectedComponent === 'book') {
      return <BookDetails />;
    } else if (selectedComponent === 'blog') {
      return <BlogDetails />;
    } else if (selectedComponent === 'course') {
      return <CourseDetails />;
    } else {
      return <p>Select a category to display details.</p>;
    }
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Blogger App</h1>

      {/* Way 2: Ternary operator for button label */}
      <button onClick={() => setSelectedComponent('book')}>Book</button>{' '}
      <button onClick={() => setSelectedComponent('blog')}>Blog</button>{' '}
      <button onClick={() => setSelectedComponent('course')}>Course</button>

      <hr />

      {/* Way 3: Function-based rendering */}
      {renderComponent()}

      {/* Way 4: Logical AND */}
      {selectedComponent === '' && <p>No section selected</p>}
    </div>
  );
}

export default App;
