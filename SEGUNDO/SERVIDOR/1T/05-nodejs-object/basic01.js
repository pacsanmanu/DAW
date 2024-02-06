function updownvotes(votes){
    return votes.upvotes - votes.downvotes;
}

const votes = {
    upvotes: 31,
    downvotes: 12
};

console.log(updownvotes(votes));