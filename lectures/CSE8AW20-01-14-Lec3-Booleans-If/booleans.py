def is_positive(n):
    return n > 0

def is_longer_than(s, n):
    return len(s) > n

def starts_with_b(s):
    return s >= "b" and s < "c"

def in_box(bottom, top, left, right, x, y):
    return y >= bottom and y <= top \
      and x <= right and x >= left
    
def convert_dollars_to(currency, amount):
  if currency == "EUR":   # Euros 
    return amount * 0.9
  elif currency == "GBP": # Pound sterling
    return amount * 0.77
  elif currency == "CRC": # Costa Rican Colon
    return amount * 572.62
  else:
    raise(Exception("Unsupported currency"))

def my_abs(n):
  if n < 0:
    return n * -1
  else:
    return n




def letter_grade(points):
  if points >= 90: return "A"
  elif points >= 80: return "B"
  elif points >= 70: return "C"
  else: return "F"
