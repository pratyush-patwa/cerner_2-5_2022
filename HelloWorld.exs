# cerner_2tothe5th_2022

send(self(), {:hello, "Hello World!"})

receive do
   {:hello, msg} -> IO.puts(msg)
   {:another_case, msg} -> IO.puts("This one won't match!")
end
