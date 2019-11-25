import React, { useState } from 'react';

function Login({ history }) {
  const [collegeId, setCollegeId] = useState('');
  const [password, setPassword] = useState('');

  function onClick() {
    if (collegeId !== '' && collegeId !== '') {
      history.push('/Students');
    }
  }

  return (
    <div className='box'>
      <div>Sign In</div>
      <hr/>
      <div className='box-field'>
        <label for='collegeId'>College ID:</label>
        <input id='collegeId' type='text' value={collegeId} onChange={e => setCollegeId(e.target.value)} />
      </div>
      <div className='box-field'>
        <label for='password'>Password:</label>
        <input id='password' type='password' value={password} onChange={e => setPassword(e.target.value)} />
      </div>
      <button onClick={onClick}>SIGN IN</button>
    </div>
  );
}

export default Login;
