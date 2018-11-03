var arr=[10, 20, 30, 40, 50, 60, 70, 20, 30, 40];

var distinctArr =[];

function duplicateElement(arr){

for (let i in arr)
 {
	if(!distinctArr.includes(arr[i])) {
		distinctArr.push(arr[i]);
	}
 }
}

duplicateElement(arr);
console.log("Distinct elements: "+distinctArr);