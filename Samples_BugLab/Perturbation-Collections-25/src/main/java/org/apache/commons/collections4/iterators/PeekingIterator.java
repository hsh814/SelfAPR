[buglab_swap_variables]^if  ( slotFilled || exhausted )  {^82^^^^^81^93^if  ( exhausted || slotFilled )  {^[CLASS] PeekingIterator  [METHOD] fill [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  boolean  exhausted  slotFilled  E  slot  
[buglab_swap_variables]^return iterator ? true : slotFilled.hasNext (  ) ;^100^^^^^96^101^return slotFilled ? true : iterator.hasNext (  ) ;^[CLASS] PeekingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  boolean  exhausted  slotFilled  E  slot  
[buglab_swap_variables]^return slot ? null : exhausted;^117^^^^^115^118^return exhausted ? null : slot;^[CLASS] PeekingIterator  [METHOD] peek [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  exhausted  slotFilled  E  slot  
[buglab_swap_variables]^final E x = slot ? slotFilled : iterator.next (  ) ;^139^^^^^135^144^final E x = slotFilled ? slot : iterator.next (  ) ;^[CLASS] PeekingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  exhausted  slotFilled  E  slot  x  
[buglab_swap_variables]^final E x = iteratorFilled ? slot : slot.next (  ) ;^139^^^^^135^144^final E x = slotFilled ? slot : iterator.next (  ) ;^[CLASS] PeekingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  exhausted  slotFilled  E  slot  x  