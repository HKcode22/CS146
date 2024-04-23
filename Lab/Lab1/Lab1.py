def two_sum(nums, target):
    numindex = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in numindex:
            return [numindex[complement], i]
        numindex[nums[i]] = i
    raise ValueError("There is no two sum solution")

if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    result = two_sum(nums, target)
    print(f"[{result[0]}, {result[1]}]")
