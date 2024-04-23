def insertionsort(array):
    n=len(array)
    for i in range(1, n):
        key = array[i]
        j= i - 1
        while j >= 0 and array[j] > key:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = key

def matrix_multiply(A, B):
    if len(A[0]) != len(B):
        raise ValueError("Matrix multiplication is not defined.")
    row_A = len(A)
    cols_A = len(A[0])
    cols_B = len(B[0])
    result = [[0] * cols_B for _ in range(row_A)]

    for i in range(row_A):
        for j in range(cols_B):
            sum_ = 0
            for k in range(cols_A):
                sum_ += A[i][k] * B[k][j]
            result[i][j] = sum_
    return result

if __name__ == "__main__":
    array = [1, 4, 5, 3, 2, 9, 6]

    print("Array without sorting:")
    print(array)

    insertionsort(array)

    print("Array with sorting:")
    print(array)

    A = [[1, 2, 3],
         [4, 5, 6],
         [7, 8, 9]]

    B = [[9, 8, 7],
         [6, 5, 4],
         [3, 2, 1]]

    output = matrix_multiply(A, B)

    print("Result of matrix multiplication:")
    for row in output:
        print(row)
