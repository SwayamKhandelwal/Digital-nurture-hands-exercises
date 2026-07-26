import React from 'react';
import './App.css';

export const books = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive into Angular 11 ', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 },
];

export const courses = [
  { id: 201, cname: 'Angular', date: '4/5/2021' },
  { id: 202, cname: 'React', date: '6/3/20201' },
];

export const blogs = [
  {
    id: 301,
    title: 'React Learning',
    author: 'Stephen Biz',
    description: 'Welcome to learning React!',
  },
  {
    id: 302,
    title: 'Installation',
    author: 'Schewzdenier',
    description: 'You can install React from npm.',
  },
];

function CourseDetails(props) {
  const showCourses = props.courses && props.courses.length > 0;

  return (
    <div>
      {showCourses ? (
        <ul>
          {props.courses.map((course) => (
            <div key={course.id} className="item-spacing">
              <h2>{course.cname}</h2>
              <p><strong>{course.date}</strong></p>
            </div>
          ))}
        </ul>
      ) : (
        <p>No courses available.</p>
      )}
    </div>
  );
}

function BookDetails(props) {
  const bookdet = (
    <ul>
      {props.books && props.books.map((book) => (
        <div key={book.id} className="item-spacing">
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return <div>{bookdet}</div>;
}

function BlogDetails(props) {
  const showBlogs = true;

  return (
    <div>
      {showBlogs && (
        <ul>
          {props.blogs.map((blog) => (
            <div key={blog.id} className="item-spacing">
              <h2>{blog.title}</h2>
              <p><strong>{blog.author}</strong></p>
              <p>{blog.description}</p>
            </div>
          ))}
        </ul>
      )}
    </div>
  );
}

function App() {
  const showSection = true;

  let coursedet;
  if (showSection) {
    coursedet = <CourseDetails courses={courses} />;
  } else {
    coursedet = null;
  }

  const bookdet = showSection ? <BookDetails books={books} /> : null;
  const content = showSection && <BlogDetails blogs={blogs} />;

  return (
    <div className="container">
      <div className="column column-border">
        <h1>Course Details</h1>
        {coursedet}
      </div>

      <div className="column column-border">
        <h1>Book Details</h1>
        {bookdet}
      </div>

      <div className="column">
        <h1>Blog Details</h1>
        {content}
      </div>
    </div>
  );
}

export default App;