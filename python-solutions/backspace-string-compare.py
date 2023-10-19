class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        sb = []
        tb = []
        for x in range(len(s)):
            if s[x]  == '#' :
                if len(sb) != 0:
                    sb.pop()
            else :
                sb.append(s[x])
        
        for x in range(len(t)):
            if t[x] == '#' :
                if len(tb) != 0:
                    tb.pop()
            else :
                tb.append(t[x])

        if len(sb) != len(tb):
            return False

        for x in range(len(sb)):
            if sb[x] != tb[x]:
                return False

        return True