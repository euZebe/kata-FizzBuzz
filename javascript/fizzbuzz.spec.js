const fizzbuzz = require('./fizzbuzz');

describe('fizzbuzz', () => {
  it('should return intergers unchanged under 3', () => {
    expect(fizzbuzz(1)).toEqual([1]);
    expect(fizzbuzz(2)).toEqual([1, 2]);
  });

  it('should replace 3 by fizz', () => {
    expect(fizzbuzz(3)).toEqual([1, 2, 'fizz']);
  });
  it('should replace 5 by buzz', () => {
    expect(fizzbuzz(5)).toEqual([1, 2, 'fizz', 4, 'buzz']);
  });
  it('should replace multiples of 3 by fizz', () => {
    expect(fizzbuzz(6)).toEqual([1, 2, 'fizz', 4, 'buzz', 'fizz']);
  });
  it('should replace multiples of 5 by buzz', () => {
    expect(fizzbuzz(10)).toEqual([1, 2, 'fizz', 4, 'buzz', 'fizz', 7, 8, 'fizz', 'buzz']);
  });
  it('should combine fizz and buzz when multiple of both 3 and 5', () => {
    expect(fizzbuzz(15)).toEqual([1, 2, 'fizz', 4, 'buzz', 'fizz', 7, 8, 'fizz', 'buzz', 11, 'fizz', 13, 14, 'fizzbuzz']);
  });
});