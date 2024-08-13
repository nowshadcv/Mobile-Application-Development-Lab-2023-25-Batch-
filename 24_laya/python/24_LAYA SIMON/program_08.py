def copyfile(sourcefile,destfile):
    try:
        with open(sourcefile,'r') as src:
            contents = src.read()
        with open(destfile,'w') as dst:
            dst.write(contents)
            print("file copied sucessfully!")
    except FileNotFoundError:
        print("source file not found.")
    except Exception as e:
        print(f"an error occured:(e)")
sourcefile=input("enter the source file:")
destfile=input("enter the destination file:")
copyfile(sourcefile,destfile)
