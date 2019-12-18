# Expandable recycler view

## What is this?
Make an expandable list view by RecyclerView with support for multiple view types in Android.



I will present a third-party library developed by [ThoughtBot](https://thoughtbot.com/blog/), which I think it's the best to this time, which providing us a full-featured expandable list view


## Requirements

Android 5.0 or later (Minimum SDK level 21)

Android Studio 3.0 (to compile and use)

## Define dependency

    api 'com.thoughtbot:expandablerecyclerview:1.3'
  

## Very easy to use:
For a example, you have different group where each group has a list of persons.

First, define your custom **ExpandableGroup class:**

***class Group(title: String, items: List<Person>, val iconResId: Int) :
    **ExpandableGroup**<Person>(title, items) {}***

Next up, let's create the **ChildViewHolder** and **ParentViewHolder**. 
These are both wrappers around regular **RecyclerView.ViewHolders** so implement any view inflation and binding methods you may need.

***class GroupHolder(itemView: View) : GroupViewHolder(itemView) {}***

***class PersonViewHolder(itemView: View) : ChildViewHolder(itemView) {}***


Now we are ready create adapter  - let's make our ExpandableRecyclerViewAdapter

***class GroupAdapter(groups: List<ExpandableGroup<>>) 
: ExpandableRecyclerViewAdapter<GroupHolder, PersonViewHolder>(groups) {***

    override fun onCreateGroupViewHolder(parent: ViewGroup, viewType: Int): GroupHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.group_layout_item, parent, false)
        return GroupHolder(view)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_child_item, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindChildViewHolder(
        holder: PersonViewHolder, flatPosition: Int,
        group: ExpandableGroup<*>, childIndex: Int
    ) {

       //Update UI

    }

    override fun onBindGroupViewHolder(
        holder: GroupHolder, flatPosition: Int,
        group: ExpandableGroup<*>
    ) {
       //Update UI
    }


 
## What does it look like?

![test image size](https://github.com/MilanBojic/expandable_recycler_view/blob/master/1.gif)




**Support**

If you've found an error while using the library, please file an issue. All patches are encouraged, and may be submitted by forking this project and submitting a pull request through GitHub.
