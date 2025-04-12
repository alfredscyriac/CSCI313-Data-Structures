// Sample topic data - you'll expand this with your actual content
const topics = [
    {
        id: 'arrays',
        title: 'Arrays',
        description: 'Linear data structure with elements in contiguous memory',
        icon: '[ ]',
        subtopics: [
            {
                id: 'arrays-intro',
                title: 'Introduction to Arrays',
                content: `
                    <div class="subtopic-section">
                        <h3>Introduction to Arrays</h3>
                        <p>Arrays are one of the most fundamental data structures. They store elements of the same type in contiguous memory locations.</p>
                        
                        <h4>Key Characteristics:</h4>
                        <ul>
                            <li>Fixed size (in most implementations)</li>
                            <li>Random access in O(1) time</li>
                            <li>Elements stored in contiguous memory</li>
                        </ul>
                        
                        <div class="diagram">
                            <img src="/api/placeholder/600/300" alt="Array in Memory Representation">
                            <figcaption>Visual representation of an array in memory</figcaption>
                        </div>
                        
                        <h4>Basic Array Operations in Java:</h4>
                        <pre>
// Declaration and initialization
int[] numbers = new int[5];  // Create an array of size 5

// Assigning values
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Accessing elements
int third = numbers[2];  // Gets 30

// Alternative initialization
int[] preFilledArray = {10, 20, 30, 40, 50};

// Finding array length
int length = numbers.length;  // Returns 5
                        </pre>
                    </div>
                `
            },
            {
                id: 'arrays-complexity',
                title: 'Time & Space Complexity',
                content: `
                    <div class="subtopic-section">
                        <h3>Array Time & Space Complexity</h3>
                        
                        <p>Understanding the efficiency of arrays is critical for algorithm design.</p>
                        
                        <h4>Time Complexity</h4>
                        <ul>
                            <li><strong>Access</strong>: O(1) - Constant time</li>
                            <li><strong>Search</strong>: O(n) - Linear time (for unsorted arrays)</li>
                            <li><strong>Search</strong>: O(log n) - If the array is sorted (binary search)</li>
                            <li><strong>Insertion/Deletion</strong>: O(n) - May require shifting elements</li>
                        </ul>
                        
                        <div class="diagram">
                            <img src="/api/placeholder/600/350" alt="Array Operations Time Complexity">
                            <figcaption>Visualization of array operations and their time complexity</figcaption>
                        </div>
                        
                        <h4>Implementation Example: Binary Search</h4>
                        <pre>
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        // Check if target is present at mid
        if (arr[mid] == target)
            return mid;
        
        // If target greater, ignore left half
        if (arr[mid] < target)
            left = mid + 1;
        
        // If target smaller, ignore right half
        else
            right = mid - 1;
    }
    
    // Element not found
    return -1;
}
                        </pre>
                    </div>
                `
            }
        ]
    },
    {
        id: 'linked-lists',
        title: 'Linked Lists',
        description: 'Linear collection of elements connected via pointers',
        icon: '→→',
        subtopics: [
            {
                id: 'linked-lists-intro',
                title: 'Introduction to Linked Lists',
                content: `
                    <div class="subtopic-section">
                        <h3>Introduction to Linked Lists</h3>
                        <p>A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence.</p>
                        
                        <h4>Key Characteristics:</h4>
                        <ul>
                            <li>Dynamic size</li>
                            <li>Efficient insertions and deletions</li>
                            <li>No random access</li>
                            <li>More memory overhead than arrays</li>
                        </ul>
                        
                        <div class="diagram">
                            <img src="/api/placeholder/650/200" alt="Linked List Structure">
                            <figcaption>Basic structure of a singly linked list</figcaption>
                        </div>
                        
                        <h4>Basic Linked List Implementation in Java:</h4>
                        <pre>
class Node {
    int data;
    Node next;
    
    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    // Method to insert a new node at the front
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Usage example
LinkedList list = new LinkedList();
list.insertAtFront(10);
list.insertAtFront(20);
list.insertAtFront(30);
list.printList();  // Output: LinkedList: 30 -> 20 -> 10 -> null
                        </pre>
                    </div>
                `
            }
        ]
    },
    {
        id: 'stacks',
        title: 'Stacks',
        description: 'LIFO data structure with push and pop operations',
        icon: '▓▓',
        subtopics: []
    },
    {
        id: 'queues',
        title: 'Queues',
        description: 'FIFO data structure for sequential processing',
        icon: '◁◁',
        subtopics: []
    },
    {
        id: 'trees',
        title: 'Trees',
        description: 'Hierarchical data structure with parent-child relationships',
        icon: '◆◆',
        subtopics: []
    },
    {
        id: 'graphs',
        title: 'Graphs',
        description: 'Network structure with vertices and edges',
        icon: '◎◎',
        subtopics: []
    },
    {
        id: 'hash-tables',
        title: 'Hash Tables',
        description: 'Key-value store using hash functions',
        icon: '##',
        subtopics: []
    },
    {
        id: 'sorting',
        title: 'Sorting Algorithms',
        description: 'Methods to arrange data in a specific order',
        icon: '↕↕',
        subtopics: []
    }
];

// Generate topic cards on the landing page
document.addEventListener('DOMContentLoaded', function() {
    const topicsGrid = document.getElementById('topicsGrid');
    
    topics.forEach(topic => {
        const card = document.createElement('div');
        card.className = 'topic-card';
        card.dataset.topicId = topic.id;
        
        card.innerHTML = `
            <div class="card-icon">${topic.icon}</div>
            <div class="card-content">
                <h3>${topic.title}</h3>
                <p>${topic.description}</p>
            </div>
        `;
        
        card.addEventListener('click', () => openTopic(topic.id));
        topicsGrid.appendChild(card);
    });

    // Back button functionality
    document.getElementById('backButton').addEventListener('click', () => {
        document.getElementById('topicPage').style.display = 'none';
        document.getElementById('topicsPage').style.display = 'block';
    });

    // Sidebar toggle functionality for mobile
    document.getElementById('toggleSidebar').addEventListener('click', () => {
        document.getElementById('sidebar').classList.toggle('active');
        document.getElementById('sidebarOverlay').classList.toggle('active');
    });

    document.getElementById('sidebarOverlay').addEventListener('click', () => {
        document.getElementById('sidebar').classList.remove('active');
        document.getElementById('sidebarOverlay').classList.remove('active');
    });

    // Dark mode toggle
    document.getElementById('themeToggle').addEventListener('click', () => {
        document.body.classList.toggle('dark-mode');
        const themeButton = document.getElementById('themeToggle');
        themeButton.textContent = document.body.classList.contains('dark-mode') ? '☀️' : '🌙';
    });
});

// Function to open a topic
function openTopic(topicId) {
    const topic = topics.find(t => t.id === topicId);
    if (!topic) return;
    
    document.getElementById('topicsPage').style.display = 'none';
    document.getElementById('topicPage').style.display = 'block';
    
    document.getElementById('topicTitle').textContent = topic.title;
    document.getElementById('sidebarTopicTitle').textContent = topic.title;
    
    // Generate sidebar navigation
    const topicNav = document.getElementById('topicNavigation');
    topicNav.innerHTML = '';
    
    if (topic.subtopics && topic.subtopics.length > 0) {
        topic.subtopics.forEach(subtopic => {
            const navItem = document.createElement('li');
            navItem.className = 'topic-nav-item';
            navItem.textContent = subtopic.title;
            navItem.dataset.subtopicId = subtopic.id;
            
            navItem.addEventListener('click', () => {
                // Remove active class from all items
                document.querySelectorAll('.topic-nav-item').forEach(item => {
                    item.classList.remove('active');
                });
                
                // Add active class to clicked item
                navItem.classList.add('active');
                
                // Load content
                document.getElementById('contentArea').scrollTop = 0;
                document.getElementById('topicContent').innerHTML = subtopic.content;
            });
            
            topicNav.appendChild(navItem);
        });
        
        // Automatically select first subtopic
        if (topic.subtopics.length > 0) {
            const firstNavItem = topicNav.querySelector('.topic-nav-item');
            firstNavItem.classList.add('active');
            document.getElementById('topicContent').innerHTML = topic.subtopics[0].content;
        }
    } else {
        // If no subtopics, show a placeholder
        document.getElementById('topicContent').innerHTML = `
            <div class="text-center" style="padding: 50px;">
                <p>No content available for this topic yet.</p>
            </div>
        `;
    }
}