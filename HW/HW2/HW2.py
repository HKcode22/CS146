def findBadversion(tar):
    left = 1
    right = tar
  
    while left<=right:
        mid = (right + left)/2
        if isBadVersion(mid):
            right = mid
        else:
            left = mid + 1
    return left

def isBadVersion(version):
    return version >= 4

arr = [1,2,3,4,5,6,7]
tar = 5
print("Bad Version", findBadversion(tar))



