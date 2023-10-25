import test from 'ava';
import {fizzbuzz} from '../src/fizzbuzz.js'

test('should be 1 for num = 1', t => {
    const result = fizzbuzz(1);
	t.is(result, 1);
});

test('should be "fizz" for num = 3', t => {
    const result = fizzbuzz(3);
	t.is(result, "fizz");
});

test('should be "buzz" for num = 5', t => {
    const result = fizzbuzz(5);
	t.is(result, "buzz");
});

test('should be "fizz" for num = 6', t => {
    const result = fizzbuzz(6);
	t.is(result, "fizz");
});

test('should be "fizzbuzz" for num = 15', t => {
    const result = fizzbuzz(15);
	t.is(result, "fizzbuzz");
});