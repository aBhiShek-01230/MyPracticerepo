import React from 'react';

const blogs = [
  { id: 1, title: 'React Hooks Guide' },
  { id: 2, title: 'Understanding Virtual DOM' },
  { id: 3, title: 'JSX Tips and Tricks' },
];

const BlogDetails = () => {
  return (
    <div>
      <h2>Blog Details</h2>
      <ul>
        {blogs.map((blog) => (
          <li key={blog.id}>{blog.title}</li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
