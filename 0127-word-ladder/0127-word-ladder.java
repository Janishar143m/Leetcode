class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String,List<String>> adj=new HashMap<>();
        List<String> list=null;
        wordList.add(beginWord);
        int len=beginWord.length();
        StringBuilder pattern=null;
        for(String word:wordList)
        {
            for(int i=0;i<len;i++)
            {
                pattern=new StringBuilder(word);
                pattern.setCharAt(i,'*');
                list=adj.getOrDefault(pattern.toString(),new ArrayList<String>());
                list.add(word);
                adj.put(pattern.toString(),list);
            }
        }
        return findLength(adj,beginWord,endWord);
        
    }
    private int findLength(Map<String,List<String>> adj,String beginWord,String endWord)
    {
        //System.out.println(adj.toString());
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        StringBuilder string=null;
        int length=1;
        queue.offer(beginWord);
        visited.add(beginWord);
        while(!queue.isEmpty())
        {
            length++;
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                String word=queue.poll();
                for (int j=0;j<word.length();j++)
                {
                    string=new StringBuilder(word);
                    string.setCharAt(j,'*');
                    for(String adjWord:adj.get(string.toString()))
                    {
                        if(adjWord.equals(endWord))
                            return length;
                        if(visited.contains(adjWord))
                            continue;
                        queue.offer(adjWord);
                        visited.add(adjWord);
                    }
                }
            }
        }
        return 0;
    }
}