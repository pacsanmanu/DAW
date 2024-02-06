function isSimilar(A, B, key = Object.keys(A), idx = 0) {
	var a = Array.isArray(A);
	var b = Array.isArray(B);
	if (a !== b) return false;
	if (a) return A.toString() === B.toString();
	if (Object.keys(A).toString() !== Object.keys(B).toString()) return false;
	if (idx === key.length) return true;
	var currentKey = key[idx];
	if (!isSimilar(A[currentKey], B[currentKey])) return false;
	return isSimilar(A, B, key, idx + 1);
  }
  
  console.log(isSimilar([{"A": [0, 3]}, {"X": [1, 3]}, {"D": [3, 7]}], [{"D": [0, 3]}, {"X": [1, 3]}, {"D": [3, 7]}]));
  