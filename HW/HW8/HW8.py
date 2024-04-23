def longestPalindrome(s: str) -> int:
    char_count = {}
    length = 0
    odd = False

    for c in s:
        char_count[c] = char_count.get(c, 0) + 1

    for count in char_count.values():
        if count % 2 == 0:
            length += count
        else:
            length += count - 1
            odd = True

    if odd:
        length += 1

    return length


def main():
    s = "abccccdd"
    print(longestPalindrome(s))


if __name__ == "__main__":
    main()
