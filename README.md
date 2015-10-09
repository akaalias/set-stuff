# Get the intersection of two large sets of numbers

I quickly needed to get the intersection of the contents of two files. It took me, including lein and emacs setup, all of 5 minutes to come to a simple solution. No variables, no loops, all standard functions.

## Usage

user> (in-ns 'set-stuff.core)
set-stuff.core> (intersection-files "my-ids.txt" "found-ids.txt")
#{7756496 2997031 5379724 7857667 4182588 3375641 72489 117220 5998390 4698999}
