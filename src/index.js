import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router } from 'react-router-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { ToastContainer } from 'react-toastify';

ReactDOM.render(
  <Router>
    <React.StrictMode>
      <App />
      <ToastContainer/>
    </React.StrictMode>
  </Router>,
  document.getElementById('root')
);
reportWebVitals();