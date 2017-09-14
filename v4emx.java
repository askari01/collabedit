//Question 1
//Write bubble sort algorithim?
//Example Input = (5 1 4 2 8) , Output = (1 2 4 5 8)

// code in Swift 
var array = [5,1,4,2,8]
var temp = 0
print("array count: ", array.count)
for i in 0...(array.count - 1) {
    print("i: ",i)
    for j in 1...(array.count - 1) {
        print("j: ",j)
        if array[j-1] > array[j] {
            temp = array[j-1]
            array[j-1] = array[j]
            array[j] = temp
            print(array)
        }
    }
}


//Question 2
//Count triplets with sum smaller than a given value
//Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value.
//Examples:
// Input: arr[] = {-2, 0, 1, 3) // where is the closing curly brases ? 
// output = 2

var arr = [-2,0,1,3]

arr.sort()
var sum = 2

if arr.count < 3 {
    print ("no three numbers")
}

for i in 0...(arr.count - 1) {
    for j in 1...(arr.count - 1) {
        for k in 2...(arr.count - 1) {
            if ((arr[i] + arr[j] + arr[k]) == sum) {
                print ("triplet: \(arr[i]) \(arr[j]) \(arr[k])")
            }
            // for less than SUM :
            if ((arr[i] + arr[j] + arr[k]) < sum) {
                print ("triplet small: \(arr[i]) \(arr[j]) \(arr[k])")
            }
        }
    }
}









//Question 3:
//Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
//Given a sorted array(sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as 
//sum of elements of any subset of given set.
//Example 
//Input: arr[] = {1, 3, 6, 10, 11, 15}
//Output = 2 (sum of elements positive that can't be represented by arr elements can be 0,1,2,3)

// Steps
// find the smallest number,
// fins the second smallest number
// add the two smallest number 
// as smallest positive integer is zero
// return a number that is greater than or equal to zero but less than the sum of two smallest numbers
// (smallest number os always going to be one less than than the sum of two smallest numbers in the array)

solution in swift:

let min1 = arr.min()
let index = arr.index(of: min1!)
let arr2 = arr.remove(at: index!)
let min2 = arr.min()

let sum = min1! + min2!


// printing random number between two ranges, smallest is zero always :)
print (arc4random_uniform(UInt32(sum))+0)












