function fizzbuzz(max = 10) {
  return [...Array(max)]
    .map((_, i) => i + 1) // build array of 1..N
    .map(i => (i % 3 ? '' : 'fizz') + (i % 5 ? '' : 'buzz') || i);
}

module.exports = fizzbuzz;