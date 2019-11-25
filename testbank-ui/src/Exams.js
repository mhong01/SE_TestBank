import React from 'react';
import { Link } from 'react-router-dom';
import edit from './edit.png';
import trash from './trash.png';

const exams = [
  "CSIS 3275 Midterm",
  "CSIS 1175 Quiz 1",
  "CSIS 1275 Quiz 2",
  "BUSN 2346 Sample Test",
];

function Exams() {
  return (
    <div className='box box-rounded'>
      <span className='box-title'>Exam IDs</span>
      <table>
        <thead>
          <tr><td><input type='checkbox' /> Select All</td></tr>
        </thead>
        <tbody>
          {exams.map((each, index) => (
            <tr>
              <td><input type='checkbox' /> <Link to={'/exams/' + (index + 1)}>{each}</Link></td>
              <td className='icons'><img src={edit} /><img src={trash} /></td>
            </tr>
          ))}
        </tbody>
      </table>
      <div className='button-div'>
        <button>Add New</button>
        <button className='gray'>Remove</button>
      </div>
    </div>
  );
}

export default Exams;
