# Security Policy

## Supported Versions

Use this section to tell people about which versions of your project are
currently being supported with security updates.

| Version | Supported          |
| ------- | ------------------ |
| 5.1.x   | :white_check_mark: |
| 5.0.x   | :x:                |
| 4.0.x   | :white_check_mark: |
| < 4.0   | :x:                |

## Reporting a Vulnerability

Use this section to tell people how to report a vulnerability.

Tell them where to go, how often they can expect to get an update on a
reported vulnerability, what to expect if the vulnerability is accepted or
declined, etc.
# .github/workflows/branch-protection-rules.md
### Example Branch Protection Rules ###
1. Require status checks to pass before merging:
   - "CodeQL Analysis"
   - "Unit Tests"
2. Require pull request reviews:
   - Minimum number of reviews: 2
3. Restrict who can push to the branch:
   - "security-team"
4. Require signed commits

