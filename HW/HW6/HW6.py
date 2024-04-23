def tripletsum(nums):
    nums.sort()
    trip = []
    n = len(nums)

    for i in range(n):
        l = i + 1
        r = n - 1
        if i > 0 and nums[i] == nums[i - 1]:
            continue

        while l < r:
            t= nums[i] + nums[l] + nums[r]
            if t == 0:
                trip.append([nums[i], nums[l], nums[r]])
                while l < r and nums[r] == nums[r - 1]:
                    r -= 1
                while l < r and nums[l] == nums[l + 1]:
                    l += 1
                l += 1
                r -= 1
            elif t < 0:
                l += 1
            else:
                r -= 1
    return trip

def main():
    a1 = [-1, 0, 1]
    a2 = [0, 1, 1]
    a3 = [-5, 0, 5, 10, -10, 0]

    print(tripletsum(a1))
    print(tripletsum(a2))
    print(tripletsum(a3))


if __name__ == "__main__":
    main()
