def palindrome(s):
    cleanstr = ''.join(char.lower() for char in s if char.isalnum())
    return cleanstr == cleanstr[::-1]

if __name__ == "__main__":
    print(palindrome("A man, a plan, a canal: Panama"))
    print(palindrome("cat dat"))
