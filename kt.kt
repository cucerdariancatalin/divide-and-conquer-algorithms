fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }
    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1
}

//The code above implements the QuickSort algorithm, a classic divide-and-conquer algorithm for sorting an array. The quickSort function takes in an array arr, a low index low, and a high index high, and sorts the subarray arr[low..high] in place. The partition function is used to divide the subarray into two parts: elements smaller than the pivot and elements greater than the pivot. The pivot is chosen as the last element of the subarray. The partition function rearranges the elements so that all elements smaller than the pivot are before it, and all elements greater than the pivot are after it. The pivot index is then returned, which becomes the boundary between the two subarrays in the subsequent recursive calls to quickSort. The QuickSort algorithm sorts the array by repeatedly dividing it into smaller subarrays and sorting those subarrays until they are small enough to be sorted directly.


