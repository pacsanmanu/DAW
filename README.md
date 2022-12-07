# DAW
Repository to save things while I study Web Applications Developing.

---

Lets see a couple of text styles for markdown files.

# Heading level 1
## Heading level 2
### Heading level 3
#### Heading level 4
##### Heading level 5
###### Heading level 6

---

We can do a line break using <"br"> without the quotes or with two spaces in a paragraph.

Like for example, <br> here, or for example  
here.

---

For bold text, we use "*", two of them before the text and two of them after it.

**This is an example of bold text**

For italic text, we use "*" like we do in bold text, but now with only one after the text and one before it.

*This is an example of italic text*

For mixing bold and italic styles, we use three "*" before and after the text.

***This is an example of bold italic text***

---

We can use blockquotes by using ">" before a text line.

> For example, like this.

Or we can also use nested blockquotes.

>For example,
>>Like this.

---

We can make an unordered list adding "-" before the elements.

#### This is my list
- 1st element
- 2nd element

Also we can make ordered lists adding "1." to the first element in our list. The numbers dont have to be in numerical order, but should start from number 1.

#### This is my ordered list

1. 1st element
2. 2nd element
3. 3rd element
4. 4th element
25. 25th element

We can check that on the .md file, the "5." element is really a "25.", but it is automatically changed to the next one in the list.

---

We can add code blocks to our files with 4 spaces or one tab.

    <body>
        <p>This is my code block</p>
    </body>

We can make an horizontal rule by using three or more "***" "---" or "___" on an empty line.

For example, here:
___

We can add images to .md files
We insert an image with !,(),[] without the commas. Inside the brackets, we put the "alt", it is the text that replaces the image if the image cant be found, and inside the parenthesis, we put the url or route of the image.

![github](https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png)

For gif images, we use the same, but the image on the url must be a gif.

![github-img](https://media3.giphy.com/media/du3J3cXyzhj75IOgvA/giphy.gif?cid=ecf05e472xzyy4v4vcs8o20vnkzcusw43jdmgmetce95yejc&rid=giphy.gif&ct=g)

---

The .gitignore file on our repository declares rules to avoid files we dont want to save. It is normally ubicated on the root directory of our repository.

### Rules on my .gitignore file

> Ignore .class files:<br>
> *.class

> Ignore .txt files:<br>
> *.txt