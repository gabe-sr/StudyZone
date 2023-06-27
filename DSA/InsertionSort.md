# Insertion Sort

The insertion sort algorithm consists of varioius simple comparisons between 2 elements, iterating througout the group being sorted. It uses a *current* element to make comparisons, and at the end of a comparison round, every element up to that element is sorted.

### Assumptions:

* The target group (i.e. array, list, set, etc...) has more than one element. *If not, the group is already sorted* (this can be accounted for in code)

### Steps:

```mermaid
flowchart TB 
	A[Get target element] --> B["Iterate over group from index (i) 0 up to target"]
	B --> C{"Is target element smaller than element (on index) i?"}
	C -- YES --> D["Store element i in temporary container tmp"]
	D --> E["Assign value of target element to element i"]
	E --> G{"Is i+1 equal to index target?"}
	G -- YES --> F["Assign value of tmp to element i+1"]
	F --> H[End]
	G -- NO --> I["Store element i+1 in temporary container tmp2"]
	I --> J["Assign value of tmp to element i+1"]
	J --> K["Add 1 to i"]
	K --> L["tmp receives tmp2"]
	L --> G
```
