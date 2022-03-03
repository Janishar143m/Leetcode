class TopVotedCandidate {
    int[]persons;
    int[]times;
   TreeMap<Integer,Integer>treeMap;
   public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        int[] maxVotes=new int[persons.length];
        this.persons=new int[persons.length];
        int max=0,maxp=-1;
        treeMap=new TreeMap<Integer,Integer>();
        for(int i=0;i<times.length;i++)
        {
             maxVotes[persons[i]]++;
           if(maxVotes[persons[i]]>=max) 
           {
               max=maxVotes[persons[i]];
               maxp=persons[i];
           } 
            this.persons[i]=maxp;
            treeMap.put(times[i],maxp);
        }
    }

    public int q(int t) {
        /*int i;
        for(i=1;i<persons.length;i++)
        {
            if(times[i-1]<=t && times[i]>t)
                return persons[i-1];
            else if(times[i]==t)
                return persons[i];
        }*/

        return this.treeMap.floorEntry(t).getValue();


    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */