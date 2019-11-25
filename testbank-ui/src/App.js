import React from 'react';
import { HashRouter as Router, Route, Switch, Link } from 'react-router-dom';
import Login from './Login';
import Students from './Students';
import Courses from './Courses';
import Exams from './Exams';
import ExamDetail from './ExamDetail';

function Menu() {
  return (
    <nav>
      <ul>
        <li><Link to='/students'>Students</Link></li>
        <li><Link to='/courses'>Courses</Link></li>
        <li><Link to='/exams'>Exams</Link></li>
      </ul>
    </nav>
  );
}

function App() {
  return (
    <Router>
      <header>
        <h1>TEST BANK<br/>DOUGLAS COLLEGE</h1>
        <Switch>
          <Route exact path='/' component={null} />
          <Route component={Menu} />
        </Switch>
      </header>
      <Switch>
        <Route exact path='/' component={Login} />
        <Route path='/students' component={Students} />
        <Route path='/courses' component={Courses} />
        <Route path='/exams/:index' component={ExamDetail} />
        <Route path='/exams' component={Exams} />
      </Switch>
    </Router>
  );
}

export default App;
