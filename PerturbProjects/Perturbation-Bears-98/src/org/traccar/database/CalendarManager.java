[REPLACE]^private final Map<Long, Calendar> calendars  = null ;^35^^^^^^^[REPLACE] private final Map<Long, Calendar> calendars = new ConcurrentHashMap<> (  ) ;^ [CLASS] CalendarManager  
[REPLACE]^private final Map<Long, Set<Object userCalendars = new ConcurrentHashMap<> (  ) ;^36^^^^^^^[REPLACE] private final Map<Long, Set<Long>> userCalendars = new ConcurrentHashMap<> (  ) ;^ [CLASS] CalendarManager  