alpa=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
      'Q','R','S','T','U','V','W','X','Y','Z']
alpa1=['D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
      'T','U','V','W','X','Y','Z','A','B','C']

user=list(input(""))
for i in user :
    mu=alpa1.index(i)
    print(alpa[mu],end='')