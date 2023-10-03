function topNotes(students){
    const result = [];
    students.forEach(element => {
        const topNote = Math.max(...element.notes);
        result.push({
            'name': element.name,
            'topNote': topNote
        });
    });
    return result;
}

const students = [{
    name: "Manuel",
    notes: [1,5,2,8,4]
},
{
    name: "Daniel",
    notes: [1,5,2,2,4]
},
{
    name: "Jesus",
    notes: [1,5,2,7,4]
},
];

console.log(topNotes(students));