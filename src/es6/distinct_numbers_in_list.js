let numbers = [10, 20, 30, 40, 50, 60, 70, 20, 30, 40];

let distinctNumbers = [];

let findDistinctElements = (numbers) => {
	for (let i in numbers)
	{
		if(!distinctNumbers.includes(numbers[i])) {
			distinctNumbers.push(numbers[i]);
		}
	 }
}

findDistinctElements(numbers);
console.log(`Distinct elements: ${distinctNumbers}`);