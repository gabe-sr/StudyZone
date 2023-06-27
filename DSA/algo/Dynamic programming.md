Dynamic programming (DP) is a technique for solving algorithmic problems that require a "optimal" solution and it can be broken down in ever smaller problems that are scaled-down versions of the broader one (i.e. Mamushka/Matryoshka doll), in other words: there is a pattern to *non-trivial* cases, and can be reused to build the outmost problem.
___
### Identifying a <u>DP</u> problem
Usually problems that can be solved using dynamic programming have two distinct characteristics that stand out:
* The problem will ask for a *optimum value*  -`(minimum cost, maximum profit,etc...)` - of a given thing, or the number of possible ways to perform something - `(how many ways to..., longest possible..., if possible to reach..., etc...)`.
* Future decisions depend on earlier ones, doing something in one step affects the next steps. There is a need to factor in previous decisions because of a constraint or the nature of the problem - `(can only buy x, after selling x ..., can only hold 1x at a time..., can't color consecutive numbered squares..., etc...)`
> Although most DP problems are structured this way, not all DP problems follow this format, and not all problems that do should be solved using DP. 
> Additionally, the first characteristic is also very common for problems that can be solved using greedy algorithms, so a problem must have both characteristics to be considered for a DP solution.
> **TIP**: consider the second characteristic to be false, and think of a counter-example that discards a greedy solution (maximum increasing subsequence)
___
### Implementing <u>DP</u>
* Bottom-Up (Tabulation)
To implement bottom-up DP, we solve the problem iteratively from the trivial/base case, up. Usually this is a bit harder to write, but with tabulation, it can be somewhat efficient if considering the recursive method.
``` (JAVA)
public void fib(int n){
	// consider n a positive number between 0 and Integer.MAX_VALUE-1
	int tab[] = new int[n+1];
	tab[0] = 0;
	tab[1] = 1;
	System.out.print("0 1");
	for(int i = 2; i <= n; i++){
		tab[i] = tab[i-1] + tab[i-2];
		System.out.print(tab[i]+" ");
	}
}
```
* Top-Down (Memoization)
To implement top-down DP, we need to define the atomic case that define the outmost problem, and all the sub-problems. We solve this recursively, by going inwards, toward the trivial/base case, and then unravel the way back.
``` (JAVA)
public void fib(int n){
	// consider n a positive number between 0 and Integer.MAX_VALUE-1
	int memo[] = new int[n+1];
	complimentary(target, memo);
}

public complimentary(int target, int memo[]){
	if(target == 0){
		memo[0] = 0;
	}
	if(target == 1){
		memo[1] = 1;
	}
	if(memo[target] == null){
		memo[target] = complimentary(memo[target-2], memo) + complientary(memo[target-1], memo);
	}
	System.out.print(memo[target] + " ");
	return;
}
```

The name of the game here is identifying the atomic problem, normally the trivial case is simple enough to grasp (fib(0)=0, fib(1)=1), but getting to the actual base problem is the crux of the matter.