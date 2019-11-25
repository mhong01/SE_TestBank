import React from 'react';

const exams = [
  {
    id: "CSIS 3275 Midterm",
    questions: [
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
    ]
  },
  {
    id: "CSIS 1175 Quiz 1",
    questions: [
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
    ]
  },
  {
    id: "CSIS 1275 Quiz 2",
    questions: [
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
    ]
  },
  {
    id: "BUSN 2346 Sample Test",
    questions: [
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
      'What types of nouns resulting from a grammatical parse should be considered as potential analysis classes? A - It is ...',
    ]
  },
];

function ExamDetail({ match }) {
  const exam = exams[match.params.index - 1];

  return (
    <div className='box box-rounded'>
      <span className='box-title'>{exam.id}</span>
      <ol>
        {exam.questions.map(each => (
          <li>{each}</li>
        ))}
      </ol>
    </div>
  );
}

export default ExamDetail;
