// Basic JavaScript for interactive elements
document.addEventListener('DOMContentLoaded', function() {
    // Smooth scrolling for anchor links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function(e) {
            e.preventDefault();
            
            const targetId = this.getAttribute('href').substring(1);
            const targetElement = document.getElementById(targetId);
            
            if (targetElement) {
                window.scrollTo({
                    top: targetElement.offsetTop - 20,
                    behavior: 'smooth'
                });
                
                // Update URL without page reload
                history.pushState(null, null, `#${targetId}`);
            }
        });
    });
    
    // Highlight current section based on URL hash
    function highlightCurrentSection() {
        const hash = window.location.hash;
        if (hash) {
            // Remove active class from all navigation items
            document.querySelectorAll('.topic-navigation a').forEach(item => {
                item.classList.remove('active');
            });
            
            // Add active class to the matching navigation item
            const activeNavItem = document.querySelector(`.topic-navigation a[href="${hash}"]`);
            if (activeNavItem) {
                activeNavItem.classList.add('active');
            }
        }
    }
    
    // Run on page load
    highlightCurrentSection();
    
    // Run when hash changes
    window.addEventListener('hashchange', highlightCurrentSection);
});

