import React, { Component } from 'react';
import edit from './edit.png';
import trash from './trash.png';


// const students = [
//   { id: 300292888, name: 'Matos Alves, Vinicius', course: 'CSIS 3275' },
//   { id: 300273279, name: 'Akumbom, Elvis Vukesu', course: 'CSIS 3275' },
//   { id: 300305726, name: 'Dang, Huu Tu Anh', course: 'CSIS 3275' },
//   { id: 300299969, name: 'Le, Minh Hong', course: 'CSIS 3275' },
//   { id: 300301386, name: 'Pylayev, Evgeny', course: 'CSIS 3275' },
// ];

class Students extends Component {
  state = {
    isLoading: true,
    students: []
  };

  async componentDidMount() {
    const response = await fetch('/api/students/');
    const body = await response.json();
    this.setState({ students: body, isLoading: false });
  }

  render() {
    const {students, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className='box box-rounded'>
        <span className='box-title'>IDs to approve</span>
        <table>
          <thead>
            <tr><td><input type='checkbox' /> Select All</td></tr>
          </thead>
          <tbody>
            {students.map(each => (
              <tr>
                <td><input type='checkbox' /> {each.studentId}</td>
                <td>{each.fullName}</td>
                <td>{each.course}</td>
                <td className='icons'><img src={edit} /><img src={trash} /></td>
              </tr>
            ))}
          </tbody>
        </table>
        <div className='button-div'><button>Approve</button></div>
      </div>
    );
  }
}

// function Students() {
//   return (
//     <div className='box box-rounded'>
//       <span className='box-title'>IDs to approve</span>
//       <table>
//         <thead>
//           <tr><td><input type='checkbox' /> Select All</td></tr>
//         </thead>
//         <tbody>
//           {students.map(each => (
//             <tr>
//               <td><input type='checkbox' /> {each.id}</td>
//               <td>{each.name}</td>
//               <td>{each.course}</td>
//               <td className='icons'><img src={edit} /><img src={trash} /></td>
//             </tr>
//           ))}
//         </tbody>
//       </table>
//       <div className='button-div'><button>Approve</button></div>
//     </div>
//   );
// }

export default Students;
