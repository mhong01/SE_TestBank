import React from 'react';
import edit from './edit.png';
import trash from './trash.png';

const courses = [
  "CSIS 3275",
  "CSIS 1175",
  "CSIS 1275",
  "BUSN 2346",
];

function Courses() {
  return (
    <div className='box box-rounded'>
      <span className='box-title'>Courses</span>
      <table>
        <thead>
          <tr><td><input type='checkbox' /> Select All</td></tr>
        </thead>
        <tbody>
          {courses.map(each => (
            <tr>
              <td><input type='checkbox' /> {each}</td>
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

export default Courses;
